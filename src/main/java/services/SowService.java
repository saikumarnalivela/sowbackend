package services;

import models.SowDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.SowRepo;

@Service
public class SowService {

    @Autowired
    public SowRepo sowrepository;



    public String saveDetails(SowDetails sowdetails){
        this.sowrepository.save(sowdetails);
        return "Details are saved";
    }
}
