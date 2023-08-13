package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Estoque;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
    // Você pode adicionar consultas personalizadas aqui, se necessário
}
