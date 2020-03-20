package pl.edu.pwsztar.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.pwsztar.domain.dto.CreateMovieDto;
import pl.edu.pwsztar.domain.dto.MovieDto;
import pl.edu.pwsztar.domain.entity.Movie;
import pl.edu.pwsztar.domain.mapper.CreateMovieMapper;
import pl.edu.pwsztar.domain.mapper.MovieListMapper;
import pl.edu.pwsztar.domain.mapper.MovieMapper;
import pl.edu.pwsztar.domain.repository.MovieRepository;
import pl.edu.pwsztar.service.MovieService;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {



    private final MovieRepository movieRepository;
    private final MovieListMapper movieListMapper;
    private final CreateMovieMapper createMovieMapper;
    private final MovieMapper movieMapper;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository,
                            MovieListMapper movieListMapper, CreateMovieMapper createMovieMapper, MovieMapper movieMapper) {

        this.movieRepository = movieRepository;
        this.movieListMapper = movieListMapper;
        this.createMovieMapper = createMovieMapper;
        this.movieMapper = movieMapper;
    }

    @Override
    public List<MovieDto> findAll() {
        List<Movie> movies = movieRepository.findAll();
        return movieListMapper.mapToDto(movies);
    }

    @Override
    public MovieDto getOne(Long id){
        Movie movie = movieRepository.getOne(id);
        return movieMapper.mapToDto(movie);
    }


    @Override
    public void createMovie(CreateMovieDto createMovieDto) {
        movieRepository.save(createMovieMapper.mapToEntity(createMovieDto));
    }

    @Override
    public void deleteMovie(MovieDto movieDto){
        movieRepository.delete(movieMapper.mapToEntity(movieDto));
    }
}
