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

package com.vignesh.moviebucket.services;

import com.vignesh.moviebucket.models.Movie;
import com.vignesh.moviebucket.models.SearchResult;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    public MovieService() {}

    public List<SearchResult> getSearchResults(String apiKey, String query) {
        List<SearchResult> list = new ArrayList<>();
        list.add(new SearchResult());
        list.add(new SearchResult());
        list.add(new SearchResult());
        return list;
    }

    public Movie getMovieById(String apiKey, String movieId) {
        return new Movie();
    }

}
