package org.generation.BlogPessoal.repository;

import java.util.List;
import java.util.Optional;
import org.generation.BlogPessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public List<Usuario> findAllByNomeContainingIgnoreCase (String nome);
	public Optional<Usuario> findByUsuarioAndSenha(String usuario, String senha);
	public Optional<Usuario> findByUsuario (String usuario);
	
}
