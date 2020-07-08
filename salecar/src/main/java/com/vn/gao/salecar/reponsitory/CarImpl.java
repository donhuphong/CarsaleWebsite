package com.vn.gao.salecar.reponsitory;

import com.vn.gao.salecar.entity.CarEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CarImpl implements CarReponsitory {

    @Override
    public List<CarEntity> findAll() {
        return null;
    }

    @Override
    public List<CarEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<CarEntity> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<CarEntity> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(CarEntity carEntity) {

    }

    @Override
    public void deleteAll(Iterable<? extends CarEntity> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends CarEntity> S save(S s) {
        return null;
    }

    @Override
    public <S extends CarEntity> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<CarEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends CarEntity> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<CarEntity> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public CarEntity getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends CarEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends CarEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends CarEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends CarEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends CarEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends CarEntity> boolean exists(Example<S> example) {
        return false;
    }
}
