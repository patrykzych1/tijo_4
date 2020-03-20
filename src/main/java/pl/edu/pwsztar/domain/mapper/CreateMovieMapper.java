package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.CreateMovieDto;

import pl.edu.pwsztar.domain.entity.Movie;


@Component
public class CreateMovieMapper {

    public Movie mapToEntity(CreateMovieDto createMovieDto){
        Movie movie = new Movie();

        movie.setTitle(createMovieDto.getTitle());
        movie.setImage(createMovieDto.getImage());
        movie.setYear(createMovieDto.getYear());

        return movie;
    }
}
