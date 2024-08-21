//package com.example.ohyeahGaori.domain.sample.dao;
//
//import com.yukgaejang.inflearnclone.domain.sample.domain.Sample;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.lang.NonNull;
//
//import java.util.Optional;
//
//public interface SampleDao extends JpaRepository<Sample, Long>, SampleDaoCustom {
//    @Override
//    @NonNull
//    Page<Sample> findAll(@NonNull Pageable pageable);
//
//    @Override
//    @NonNull
//    Optional<Sample> findById(@NonNull Long id);
//}
