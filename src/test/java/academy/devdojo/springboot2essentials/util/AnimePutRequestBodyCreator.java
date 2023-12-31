package academy.devdojo.springboot2essentials.util;

import academy.devdojo.springboot2essentials.dto.AnimePostRequestBody;
import academy.devdojo.springboot2essentials.dto.AnimePutRequestBody;

public class AnimePutRequestBodyCreator {
    public static AnimePutRequestBody createAnimePutRequestBody(){
        return AnimePutRequestBody.builder()
                .id(AnimeCreator.createValidUpdatedAnime().getId())
                .name(AnimeCreator.createValidUpdatedAnime().getName())
                .build();
    }
}
