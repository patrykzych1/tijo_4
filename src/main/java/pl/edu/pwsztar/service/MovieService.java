package pl.edu.pwsztar.service;

import pl.edu.pwsztar.domain.dto.CreateMovieDto;
import pl.edu.pwsztar.domain.dto.MovieDto;

import java.util.List;

public interface MovieService {

    List<MovieDto> findAll();
    MovieDto getOne(Long id);

    void deleteMovie(MovieDto movieDto);
    void createMovie(CreateMovieDto createMovieDto);
}
