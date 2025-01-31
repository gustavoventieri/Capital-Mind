package gustavo.ventieri.capitalmind.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import gustavo.ventieri.capitalmind.application.repository.StockRepositoryInterface;
import gustavo.ventieri.capitalmind.domain.stock.Stock;

public interface StockRepository extends JpaRepository<Stock, Long>, StockRepositoryInterface {
    
}
