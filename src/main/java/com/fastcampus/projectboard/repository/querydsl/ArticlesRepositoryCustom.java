package com.fastcampus.projectboard.repository.querydsl;

import java.util.List;

public interface ArticlesRepositoryCustom {
    List<String> findAllDistincHashtags();
}
