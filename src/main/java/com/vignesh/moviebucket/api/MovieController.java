/*
 * Copyright 2020 Vignesh
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.vignesh.moviebucket.api;

import com.vignesh.moviebucket.models.Movie;
import com.vignesh.moviebucket.models.SearchResult;
import com.vignesh.moviebucket.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/movies")
public class MovieController {

    private final MovieService movieService;

    private static final String API_KEY = "";

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    List<SearchResult> getSearchResults(@RequestParam("search") String query) {
        return movieService.getSearchResults(API_KEY, query);
    }

    @GetMapping(path = "{movieId}")
    Movie getMovieById(@PathVariable("movieId") String movieId) {
        return movieService.getMovieById(API_KEY, movieId);
    }
}
