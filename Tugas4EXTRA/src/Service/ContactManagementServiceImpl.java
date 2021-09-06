package Service;

import entity.ContactManagement;
import jdk.swing.interop.SwingInterOpUtils;
import repository.ContactManagementRepository;

public class ContactManagementServiceImpl implements ContactManagementService {

    private ContactManagementRepository contactManagementRepository;

    public ContactManagementServiceImpl(ContactManagementRepository contactManagementRepository) {
        this.contactManagementRepository = contactManagementRepository;
    }

    @Override
    public void showContactManage() {
        ContactManagement[] model = contactManagementRepository.findAll();
        System.out.println("Contact Management");
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println("Nama\tNo.Hp");
        for (int i = 0; i < model.length; i++) {
            var target = model[i];


            if (target != null) {
                System.out.println((i + 1) + "." + target.getName() + " " + target.getPhoneNumber());
            }
        }

    }


}
