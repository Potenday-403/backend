package com.kyungbiseo.friend.domain;

public interface TributeRepository {
    void save(Tribute tribute);

    void deleteBy(Long id);

    Tribute findBy(Long id);
}
