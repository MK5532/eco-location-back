package kr.ac.kumoh.webkit.ecolocationback.repository;

import kr.ac.kumoh.webkit.ecolocationback.entity.AreaGeneratorSource;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AreaGeneratorSourceRepository extends JpaRepository<AreaGeneratorSource, Long> {
	
    // 원하는 장소의 발전원별 발전설비, 재생에너지 비율 데이터를 보내줌
	List<AreaGeneratorSource> findByArea(String Area);
	
	// 원하는 기간의 발전원별 발전설비, 재생에너지 비율 데이터를 보내줌
	List<AreaGeneratorSource> findByTime(LocalDate Time);
	
	// 원하는 기간 사이의 발전원별 발전설비, 재생에너지 비율 데이터를 보내줌
	List<AreaGeneratorSource> findByTimeBetween(LocalDate startTime, LocalDate endTime);
	
	// 원하는 지역의 기간 사이의 발전원별 발전설비, 재생에너지 비율 데이터를 보내줌
	List<AreaGeneratorSource> findByAreaAndTimeBetween(String area, LocalDate startTime, LocalDate endTime);
}
