package view;

import Service.ContactManagementService;

public class ContactManagementView {
        private ContactManagementService contactManagementService;

        public ContactManagementView(ContactManagementService contactManagementService) {
        this.contactManagementService = contactManagementService;

        }

    public void showContactManagement(){
        contactManagementService.showContactManage();
        System.out.println("\nAPLIKASI INI BARU SELESAI PADA FITUR MENAMPILKAN CONTACT MANAGER, BELUM SEMPAT UNTUK MENAMBAHKAN FITUR EDIT(ADD & REMOVE) ");
    }


}
