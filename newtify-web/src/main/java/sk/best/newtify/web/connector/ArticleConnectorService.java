package sk.best.newtify.web.connector;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import sk.best.newtify.api.ArticlesApi;
import sk.best.newtify.api.dto.ArticleDTO;
import sk.best.newtify.api.dto.CreateArticleDTO;

import java.util.List;

/**
 * @author Marek Urban
 * Copyright © 2022 BEST Technická univerzita Košice.
 * All rights reserved.
 */
@Slf4j
@Service
public class ArticleConnectorService implements ArticlesApi {

    private static final String ARTICLES_API_URL = "http://localhost:8081/v1/articles";

    private final RestTemplate restTemplate = new RestTemplate();

    @Override
    public ResponseEntity<ArticleDTO> createArticle(@NonNull CreateArticleDTO createArticleDTO) {
        // TODO Urban 13. 7. 2022: Try to implement
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteArticle(@NonNull String articleUuid) {
        // TODO Urban 13. 7. 2022: Try to implement
        return null;
    }

    @Override
    public ResponseEntity<ArticleDTO> retrieveArticle(@NonNull String articleUuid) {
        // TODO Urban 13. 7. 2022: Try to implement
        return null;
    }

    /**
     * @return remapped response entity with list of articles or an empty list
     */
    @Override
    public ResponseEntity<List<ArticleDTO>> retrieveArticles(@Nullable String topic) {
        // TODO Urban 13. 7. 2022: Try to implement
        return null;
    }

    @Override
    public ResponseEntity<Void> updateArticle(@NonNull String articleUuid,
                                              @NonNull CreateArticleDTO createArticleDTO) {
        // TODO Urban 13. 7. 2022: Try to implement
        return null;
    }

}
