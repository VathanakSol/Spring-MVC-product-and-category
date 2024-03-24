package istad.co.samplespringmvc.dto;

public record ProductRequest(
        String title,
        String description,
        float price,
        String imageUrl)
{

}
