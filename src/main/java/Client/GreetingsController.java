package Client;

import Client.repos.SuggestionsRepo;
import Client.repos.AccountsRepo;
import Client.repos.AdminRepo;
import Client.repos.PhoneRepo;
import Client.repos.PlayStationRepo;
import Client.repos.OtherRepo;
import Client.repos.CameraRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class GreetingsController {

    /*@GetMapping("/")
    public String greeting( String name, Model model) {
        return "greeting";
    }*/
    @Autowired
    private SuggestionsRepo suggestionsRepo;

    @Autowired
    private AccountsRepo accountsRepo;

    @Autowired
    private CameraRepo cameraRepo;

    @Autowired
    private PhoneRepo phoneRepo;

    @Autowired
    private PlayStationRepo playStationRepo;

    @Autowired
    private OtherRepo otherRepo;

    @Autowired
    private AdminRepo adminRepo;

    /*@GetMapping
    public String suggestions(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {

        model.addAttribute("suggestions", name);
        return "suggestions";
    }*/

    @GetMapping
    public String main1(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute(new SuggestionsEntity());
        return "main1";
    }

    @RequestMapping(value = "/buying", method = RequestMethod.GET)
    public String buying(Model model) {
        Iterable<CameraEntity> cameraList = cameraRepo.findAll();
        model.addAttribute("cameraList", cameraList);
        Iterable<PhoneEntity> phoneList = phoneRepo.findAll();
        model.addAttribute("phoneList", phoneList);
        Iterable<PlayStationEntity> playStationList = playStationRepo.findAll();
        model.addAttribute("playStationList", playStationList);
        Iterable<OtherEntity> otherList = otherRepo.findAll();
        model.addAttribute("otherList", otherList);
        /*model.addAttribute(new CameraEntity());
        model.addAttribute(new PlayStationEntity());*/
        model.addAttribute(new PlayStationEntity());
        model.addAttribute(new PhoneEntity());
        model.addAttribute(new OtherEntity());
        model.addAttribute(new CameraEntity());
        model.addAttribute(new AccountsEntity());
        return "buying";
    }

    @RequestMapping(value = "/buyingPost", method = RequestMethod.POST)
    public String makePurchase(@ModelAttribute AccountsEntity accountsEntity, Model model) {
        accountsRepo.save(accountsEntity);
        System.out.println("idaccounts: " + accountsEntity.getIdaccounts());
        System.out.println("namepr: " + accountsEntity.getNamepr());
        System.out.println("costpr: " + accountsEntity.getCostpr());
        System.out.println("producer: " + accountsEntity.getProducer());
        System.out.println("namecon: " + accountsEntity.getNamecon());
        System.out.println("emailcon: " + accountsEntity.getEmailcon());
        System.out.println("addresscon: " + accountsEntity.getAddresscon());
        System.out.println("phonecon: " + accountsEntity.getPhonecon());
        return buying(model);
    }

    @RequestMapping(value = "/autorization", method = RequestMethod.GET)
    public String authorizationPost(Model model) {

        /*model.addAttribute(new CameraEntity());
        model.addAttribute(new PlayStationEntity());*/
        model.addAttribute(new AdminEntity());
        return "autorization";
    }

    @RequestMapping(value = "/autorizationPost", method = RequestMethod.POST)
    public String makeRegistration(@ModelAttribute AdminEntity adminEntity, Model model) {
        adminRepo.save(adminEntity);
        System.out.println("idadmin: " + adminEntity.getIdadmin());
        System.out.println("namead: " + adminEntity.getNamead());
        System.out.println("loginad: " + adminEntity.getLoginad());
        System.out.println("passwordad: " + adminEntity.getPasswordad());
        return authorizationPost(model);
    }

    @RequestMapping(value = "/accounts", method = RequestMethod.GET)
    public String check_accounts(Model model) {
        Iterable<AccountsEntity> accountList = accountsRepo.findAll();
        model.addAttribute("accountList", accountList);
        Iterable<SuggestionsEntity> suggestionList = suggestionsRepo.findAll();
        model.addAttribute("suggestionList", suggestionList);
        Iterable<AdminEntity> adminList = adminRepo.findAll();
        model.addAttribute("adminList", adminList);
        /*model.addAttribute(new CameraEntity());
        model.addAttribute(new PlayStationEntity());*/
        model.addAttribute(new AdminEntity());
        model.addAttribute(new AccountsEntity());
        model.addAttribute(new SuggestionsEntity());
        return "accounts";
    }



    @RequestMapping(value = "/rate", method = RequestMethod.GET)
    public String getRate(Model model) {
        model.addAttribute(new SuggestionsEntity());
        return "main1";
    }

    @RequestMapping(value = "/suggestions", method = RequestMethod.GET)
    public String getProductsAddToDB(Model model) {
        model.addAttribute(new CameraEntity());
        model.addAttribute(new PlayStationEntity());
        model.addAttribute(new PhoneEntity());
        model.addAttribute(new OtherEntity());
        return "suggestions";
    }

    @RequestMapping(value = "/suggestionsPostCamera", method = RequestMethod.POST)
    public String getProductsAddToDB_camera(@ModelAttribute CameraEntity cameraEntity, Model model) {
        cameraRepo.save(cameraEntity);
        System.out.println("idscamera: " + cameraEntity.getIdcamera());
        System.out.println("nameca: " + cameraEntity.getNameca());
        System.out.println("costca: " + cameraEntity.getCostca());
        System.out.println("producerca: " + cameraEntity.getProducerca());
        return getProductsAddToDB(model);
    }

    @RequestMapping(value = "/suggestionsPostPlayStation", method = RequestMethod.POST)
    public String getProductsAddToDB_ps(@ModelAttribute PlayStationEntity playStationEntity, Model model) {
        playStationRepo.save(playStationEntity);
        System.out.println("idplayStation: " + playStationEntity.getIdplayStation());
        System.out.println("namecps " + playStationEntity.getNameps());
        System.out.println("costps: " + playStationEntity.getCostps());
        System.out.println("producerps: " + playStationEntity.getProducerps());
        return getProductsAddToDB(model);
    }

    @RequestMapping(value = "/suggestionsPostPhone", method = RequestMethod.POST)
    public String getProductsAddToDB_phone(@ModelAttribute PhoneEntity phoneEntity, Model model) {
        phoneRepo.save(phoneEntity);
        System.out.println("idphone: " + phoneEntity.getIdphone());
        System.out.println("namecph: " + phoneEntity.getNameph());
        System.out.println("costph: " + phoneEntity.getCostph());
        System.out.println("producerph: " + phoneEntity.getProducerph());
        return getProductsAddToDB(model);
    }

    @RequestMapping(value = "/suggestionsPostOther", method = RequestMethod.POST)
    public String getProductsAddToDB_other(@ModelAttribute OtherEntity otherEntity, Model model) {
        otherRepo.save(otherEntity);
        System.out.println("idphone: " + otherEntity.getIdother());
        System.out.println("namecph: " + otherEntity.getNameot());
        System.out.println("costph: " + otherEntity.getCostot());
        System.out.println("producerph: " + otherEntity.getProducerot());
        return getProductsAddToDB(model);
    }


    @RequestMapping(value = "/ratePost", method = RequestMethod.POST)
    public String makeRate(@ModelAttribute SuggestionsEntity suggestionsEntity, Model model) {
        suggestionsRepo.save(suggestionsEntity);
        System.out.println("idsuggestios: " + suggestionsEntity.getIdsuggestions());
        System.out.println("name: " + suggestionsEntity.getName());
        System.out.println("email: " + suggestionsEntity.getEmail());
        System.out.println("phone: " + suggestionsEntity.getPhone());
        System.out.println("rate: " + suggestionsEntity.getRate());
        return getRate(model);
    }

    @RequestMapping(value = "/buying_search_camera", method = RequestMethod.POST)
    public String searchCamera(@ModelAttribute CameraEntity cameraEntity, Model model) {
        ArrayList<CameraEntity> cameraList = new ArrayList<>(cameraRepo.findCameraEntityByNameca(cameraEntity.getNameca()));
        model.addAttribute("cameraList", cameraList);
        Iterable<PhoneEntity> phoneList = phoneRepo.findAll();
        model.addAttribute("phoneList", phoneList);
        Iterable<PlayStationEntity> playStationList = playStationRepo.findAll();
        model.addAttribute("playStationList", playStationList);
        Iterable<OtherEntity> otherList = otherRepo.findAll();
        model.addAttribute("otherList", otherList);
        model.addAttribute(new PlayStationEntity());
        model.addAttribute(new PhoneEntity());
        model.addAttribute(new OtherEntity());
        model.addAttribute(new CameraEntity());
        model.addAttribute(new AccountsEntity());
        return "buying";
    }

    @RequestMapping(value = "/buying_search_play_station", method = RequestMethod.POST)
    public String searchPS(@ModelAttribute PlayStationEntity playStationEntity, Model model) {
        ArrayList<PlayStationEntity> playStationList = new ArrayList<>(playStationRepo.findPlayStationEntityByNameps(playStationEntity.getNameps()));
        model.addAttribute("playStationList", playStationList);
        Iterable<CameraEntity> cameraList = cameraRepo.findAll();
        model.addAttribute("cameraList", cameraList);
        Iterable<PhoneEntity> phoneList = phoneRepo.findAll();
        model.addAttribute("phoneList", phoneList);
        Iterable<OtherEntity> otherList = otherRepo.findAll();
        model.addAttribute("otherList", otherList);
        model.addAttribute(new PlayStationEntity());
        model.addAttribute(new PhoneEntity());
        model.addAttribute(new OtherEntity());
        model.addAttribute(new CameraEntity());
        model.addAttribute(new AccountsEntity());
        return "buying";
    }

    @RequestMapping(value = "/buying_search_phone", method = RequestMethod.POST)
    public String searchPhone(@ModelAttribute PhoneEntity phoneEntity, Model model) {
        ArrayList<PhoneEntity> phoneList = new ArrayList<>(phoneRepo.findPhoneEntityByNameph(phoneEntity.getNameph()));
        model.addAttribute("phoneList", phoneList);
        Iterable<CameraEntity> cameraList = cameraRepo.findAll();
        model.addAttribute("cameraList", cameraList);
        Iterable<PlayStationEntity> playStationList = playStationRepo.findAll();
        model.addAttribute("playStationList", playStationList);
        Iterable<OtherEntity> otherList = otherRepo.findAll();
        model.addAttribute("otherList", otherList);
        model.addAttribute(new PlayStationEntity());
        model.addAttribute(new PhoneEntity());
        model.addAttribute(new OtherEntity());
        model.addAttribute(new CameraEntity());
        model.addAttribute(new AccountsEntity());
        return "buying";
    }


    @RequestMapping(value = "/buying_search_other", method = RequestMethod.POST)
    public String searchOther(@ModelAttribute OtherEntity otherEntity, Model model) {
        ArrayList<OtherEntity> otherList = new ArrayList<>(otherRepo.findOtherEntityByNameot(otherEntity.getNameot()));
        model.addAttribute("otherList", otherList);
        Iterable<CameraEntity> cameraList = cameraRepo.findAll();
        model.addAttribute("cameraList", cameraList);
        Iterable<PlayStationEntity> playStationList = playStationRepo.findAll();
        model.addAttribute("playStationList", playStationList);
        Iterable<PhoneEntity> phoneList = phoneRepo.findAll();
        model.addAttribute("phoneList", phoneList);
        model.addAttribute(new PlayStationEntity());
        model.addAttribute(new PhoneEntity());
        model.addAttribute(new OtherEntity());
        model.addAttribute(new CameraEntity());
        model.addAttribute(new AccountsEntity());
        return "buying";

    }

    @RequestMapping(value = "/accounts_search", method = RequestMethod.POST)
    public String searchAccountsByName(@ModelAttribute AccountsEntity accountsEntity, Model model) {
        ArrayList<AccountsEntity> accountList = new ArrayList<>(accountsRepo.findAccountsEntityByNamepr(accountsEntity.getNamepr()));
        model.addAttribute("accountList", accountList);
        Iterable<SuggestionsEntity> suggestionList = suggestionsRepo.findAll();
        model.addAttribute("suggestionList", suggestionList);
        Iterable<AdminEntity> adminList = adminRepo.findAll();
        model.addAttribute("adminList", adminList);
        model.addAttribute(new SuggestionsEntity());
        model.addAttribute(new AdminEntity());
        model.addAttribute(new AccountsEntity());
        return "accounts";
    }

    @RequestMapping(value = "/accounts", method = RequestMethod.POST)
    public String searchAdminByName(@ModelAttribute AdminEntity adminEntity, Model model) {
        ArrayList<AdminEntity> adminsList = new ArrayList<>(adminRepo.findAdminEntityByLoginad(adminEntity.getLoginad()));
        model.addAttribute("adminsList", adminsList);
        Iterable<AccountsEntity> accountList = accountsRepo.findAll();
        model.addAttribute("accountList", accountList);
        Iterable<SuggestionsEntity> suggestionList = suggestionsRepo.findAll();
        model.addAttribute("suggestionList", suggestionList);
        Iterable<AdminEntity> adminList = adminRepo.findAll();
        model.addAttribute("adminList", adminList);
        model.addAttribute(new SuggestionsEntity());
        model.addAttribute(new AdminEntity());
        model.addAttribute(new AccountsEntity());
        return "accounts";
    }
}



