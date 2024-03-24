package istad.co.samplespringmvc.dto;

import jdk.jshell.Snippet;
import lombok.Builder;

@Builder
public record ProductResponse(
        int id,
        String title,
        String description,
        float price,
        String imageUrl) {

}
