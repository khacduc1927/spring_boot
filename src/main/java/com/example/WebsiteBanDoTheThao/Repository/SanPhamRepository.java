package com.example.WebsiteBanDoTheThao.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.WebsiteBanDoTheThao.Model.SanPham;

@Repository
public interface SanPhamRepository extends JpaRepository<SanPham, Long>{

}
