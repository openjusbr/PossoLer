package br.com.possoler.api.api_posso_ler.api.respondeai_api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GenericResponseDTO {
    private List<String> lightSolution;
    private List<VideoResponseDTO> videos;
}
