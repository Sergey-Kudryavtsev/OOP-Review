package org.serega.Collection;

import java.util.*;

public class Notebook {
    private List<Contact> contactList;
    private Set<Contact> contactSet;
    private Map<String, List<Contact>> contactGroup;

    public Notebook() {
        contactList = new ArrayList<>();
        contactSet = new HashSet<>();
        contactGroup = new HashMap<>();
    }

    public boolean addContact (Contact contact) {
        if (contact == null) return false;
        if (contactSet.contains(contact)) {
          return false;
        }
        contactList.add(contact);
        contactSet.add(contact);

        String groupKey = contact.getGroup().toLowerCase();
        contactGroup.computeIfAbsent(groupKey, k -> new ArrayList<>()).add(contact);
        return true;
    }

    public boolean deleteContact (String name, String phone) {
        Iterator<Contact> iterator = contactList.iterator();
        while (iterator.hasNext()) {
            Contact current = iterator.next();
            if (current.getName().equalsIgnoreCase(name) && current.getPhone().equals(phone)) {
                iterator.remove();
                contactSet.remove(current);

                String groupKey = current.getGroup().toLowerCase();
                List<Contact> groupList = contactGroup.get(groupKey);
                if (groupList != null) {
                    groupList.remove(current);
                    if (groupList.isEmpty()) {
                        contactGroup.remove(groupKey);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public List<Contact> searchContact (String name) {
        List<Contact> result = new ArrayList<>();
        for (Contact con : contactList) {
            if (con.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(con);
            }
        }
        return result;
    }

    public List<Contact> getContacts (String group) {
        return contactGroup.getOrDefault(group.toLowerCase(), Collections.emptyList());
    }

    public void allContacts () {
        if (contactList.isEmpty()) {
            System.out.println("Нет контактов");
            return;
        }
        for (Contact cont : contactList) {
            System.out.println(cont);
        }
    }
}
