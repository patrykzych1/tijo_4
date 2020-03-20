package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.MovieDto;
import pl.edu.pwsztar.domain.entity.Movie;

@Component
public class MovieMapper {
    public Movie mapToEntity(MovieDto movieDto){
        Movie movie = new Movie();

        movie.setMovieId(movieDto.getMovieId());
        movie.setImage(movieDto.getImage());
        movie.setTitle(movieDto.getTitle());
        movie.setYear(movieDto.getYear());

        return movie;
    }

    public MovieDto mapToDto(Movie movie){
        MovieDto movieDto = new MovieDto();

        movieDto.setMovieId(movie.getMovieId());
        movieDto.setImage(movie.getImage());
        movieDto.setTitle(movie.getTitle());
        movieDto.setYear(movie.getYear());

        return movieDto;
    }
}
