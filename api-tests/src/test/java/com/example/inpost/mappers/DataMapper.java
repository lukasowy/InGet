package com.example.inpost.mappers;

import com.example.inpost.model.Item;
import com.example.inpost.model.Location;
import com.example.inpost.model.SelectedFields;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DataMapper {

    public List<SelectedFields> mapToSelectedFields(List<Item> items) {
        return items.stream().map(item -> SelectedFields.builder()
                        .name(item.getName())
                        .postCode(item.getAddressDetails().getPostCode())
                        .location(Location.builder()
                                .longitude(item.getLocation().getLongitude())
                                .latitude(item.getLocation().getLatitude())
                                .build())
                        .build())
                .collect(Collectors.toList());
    }
}
