package repository;

import entity.ContactManagement;

public class ContactManagementRepoImpl implements  ContactManagementRepository{

   public ContactManagement []  data = new ContactManagement[10];

    @Override
    public ContactManagement[] findAll() {
        return data;
    }


}
