package pl.edu.pwsztar.domain.mapper;

import pl.edu.pwsztar.domain.dto.CreateMovieDto;

import pl.edu.pwsztar.domain.entity.Movie;



public class CreateMovieListMapper {

    public Movie mapToEntity(CreateMovieDto createMovieDto){
        Movie movie = new Movie();

        movie.setTitle(createMovieDto.getTitle());
        movie.setImage(createMovieDto.getImage());
        movie.setYear(createMovieDto.getYear());

        return movie;
    }
}
