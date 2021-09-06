import Service.ContactManagementService;
import Service.ContactManagementServiceImpl;
import entity.ContactManagement;
import repository.ContactManagementRepoImpl;
import view.ContactManagementView;

public class AplikasiContactManagement {
    public static void main(String[] args) {
        ContactManagementRepoImpl contactManagementRepository = new ContactManagementRepoImpl();
        contactManagementRepository.data[0] = new ContactManagement("Rizky", "081283292376");
        contactManagementRepository.data[1] = new ContactManagement("April", "081290894335");
        contactManagementRepository.data[2] = new ContactManagement("Yasin", "089491983843");
        contactManagementRepository.data[3] = new ContactManagement("Raraa", "089058903845");
        contactManagementRepository.data[4] = new ContactManagement("Rafii", "081249385858");
        contactManagementRepository.data[4] = new ContactManagement("Milaa", "081212312423");

        ContactManagementService contactManagementService = new ContactManagementServiceImpl(contactManagementRepository);
        ContactManagementView contactManagementView = new ContactManagementView(contactManagementService);

        contactManagementView.showContactManagement();
    }
}
