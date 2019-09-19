package com.example.sheepfold.service;




import com.example.sheepfold.model.Model;

import java.util.Date;
import java.util.List;

public interface ModelService {
    public List<Model> findAllModel();

    List<Model> findModelByTime(Date date);
    public int deleteModelById(String modelId);

    public int deleteModelByIds(String[] arr);

    public int InsertModel(Model model);

    public Model selectModelById(String modelId);
}
