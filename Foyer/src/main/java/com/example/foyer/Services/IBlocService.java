package com.example.foyer.Services;

import com.example.foyer.Entities.Bloc;

import java.util.List;
import java.util.Optional;

public interface IBlocService {
    Bloc addBloc (Bloc bloc);
    List<Bloc> getAllBlocs();
    Optional<Bloc> getBlocById (long idBloc);
    void deleteBloc(long idBloc);
    Bloc updateBloc (Bloc bloc);
}
