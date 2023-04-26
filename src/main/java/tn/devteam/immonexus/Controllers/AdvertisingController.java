
package tn.devteam.immonexus.Controllers;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import tn.devteam.immonexus.Entities.Advertising;
import tn.devteam.immonexus.Entities.AdvertisingInput;
import tn.devteam.immonexus.Interfaces.IAdvertisingService;
import tn.devteam.immonexus.Interfaces.IFileUploadService;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/", exposedHeaders = "Access-Control-Allow-Origin")
@RestController
@AllArgsConstructor
@RequestMapping("/Advertising")
@Slf4j
public class AdvertisingController {
    IAdvertisingService iAdvertisingService;
    IFileUploadService iFileUploadService;

    @GetMapping("/get-AllAdvertising")
    public List<Advertising> getAllAdvertising() {
       return  this.iAdvertisingService.getAllAdvertising();
    }

    @DeleteMapping("/delete-Advertising-ById/{idA}")
    public void deleteById(@PathVariable("idA") Long idAdvertising) {
        iAdvertisingService.deleteById(idAdvertising);
    }

    @PostMapping("/add-Advertising")
    public Advertising addAdvertising(@RequestBody Advertising  advertising) {

        return iAdvertisingService.addAdvertising(advertising);
    }
    @PutMapping("/updateAdvertising")
    public Advertising updateAdvertising(@RequestBody Advertising a) {
        return iAdvertisingService.updateAdvertising(a);
    }



//@RequestParam("file") MultipartFile file,@RequestParam("advertising") String advertising
  /*@PostMapping("/add-Advertisingg")
   public Advertising addAdvertising( @RequestBody AdvertisingInput advertising) throws IOException {
      System.out.println(advertising);
    //   iFileUploadService.uploadfile(advertising.getFile());

       return  iAdvertisingService.addAdvertising(advertising.getAdvertising());

   }*/

    @PostMapping("/add-Advertisingg")
    public Advertising addAdvertising(@RequestParam("file") MultipartFile file, @RequestParam("advertising") String advertising) throws IOException {
        Advertising advertising1;
        ObjectMapper objectMapper = new ObjectMapper();
        iFileUploadService.uploadfile(file);
        advertising1= objectMapper.readValue(advertising,Advertising.class);
        // log.info("hhhhhhhhhhhhhhhhh:::::"+advertising1.getTitre());
        return  iAdvertisingService.addAdvertising(advertising1);
    }

}
