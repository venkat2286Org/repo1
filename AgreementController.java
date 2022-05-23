@RestController
public class AgreementController {


    @GetMapping("/agreements")
    @ResponseBody
    public String healthz(){

        System.out.println("Agreements!");

        return "Agreements";

    }
}
