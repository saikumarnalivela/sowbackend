package services;

import models.SowDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.SowRepo;

@Service
public class SowService {

    @Autowired
    private SowRepo sowrepository;

    public String savedetails(SowDetails sowdetails){
        sowrepository.save(sowdetails);
        return "Details are saved";
    }
}
