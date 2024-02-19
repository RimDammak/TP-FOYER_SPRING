package com.example.foyer.Services;

import com.example.foyer.Repository.BlocRepository;
import com.example.foyer.Repository.ChambreRepository;
import com.example.foyer.Entities.Bloc;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)

public class BlocServiceImpl implements IBlocService {
    BlocRepository blocRepository;
    ChambreRepository chambreRepository;

    @Override
    public Bloc addBloc (Bloc bloc){
        return blocRepository.save(bloc);
    }

    @Override
    public List<Bloc> getAllBlocs() {
        return (List<Bloc>) blocRepository.findAll();
    }

    @Override
    public Optional<Bloc> getBlocById(long idBloc) {
        return blocRepository.findById(idBloc);
    }

    @Override
    public void deleteBloc(long idBloc) {
         blocRepository.deleteById(idBloc);

    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }
}
