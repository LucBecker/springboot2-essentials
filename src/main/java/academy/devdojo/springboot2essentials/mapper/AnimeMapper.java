package academy.devdojo.springboot2essentials.mapper;

import academy.devdojo.springboot2essentials.dto.AnimePostRequestBody;
import academy.devdojo.springboot2essentials.dto.AnimePutRequestBody;
import academy.devdojo.springboot2essentials.entity.Anime;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class AnimeMapper {
    public static final AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class);

    public abstract Anime toAnime(AnimePostRequestBody animePostRequestBody);

    public abstract Anime toAnime(AnimePutRequestBody animePostRequestBody);
}
