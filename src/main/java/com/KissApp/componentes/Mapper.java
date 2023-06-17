package com.KissApp.componentes;

import com.KissApp.component.Usuario.UsuarioDTO;
import com.KissApp.component.Usuario.UsuarioEntity;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    // TODO: Considerar nullpointers.
    /**
     * Mapper para entidad Device.
     * @param usuarioEntity
     * @return DeviceDTO
     */

    public UsuarioDTO convertEntityToDto(UsuarioEntity usuarioEntity) {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setUserName(usuarioEntity.getUserName());
        usuarioDTO.setNombre(usuarioEntity.getNombre());
        usuarioDTO.setApellido(usuarioEntity.getApellido());
        usuarioDTO.setPassword(usuarioEntity.getPassword());
        usuarioDTO.setTelefono(usuarioEntity.getTelefono());
        usuarioDTO.setEdad(usuarioEntity.getEdad());
        usuarioDTO.setAltura(usuarioEntity.getAltura());
        usuarioDTO.setGenero(usuarioEntity.getGenero());
        usuarioDTO.setCiudad(usuarioEntity.getCiudad());
        usuarioDTO.setCoche(usuarioEntity.getCoche());
        usuarioDTO.setMusica_favorita(usuarioEntity.getMusica_favorita());
        usuarioDTO.setSalario(usuarioEntity.getSalario());

        return usuarioDTO;
    }
    /**
     * Mapper para entidad Device.
     * @param usuarioDTO
     * @return DeviceDTO
     */
    public UsuarioEntity convertDtoToEntity(UsuarioDTO usuarioDTO) {
        UsuarioEntity usuarioEntity = new UsuarioEntity();
        usuarioEntity.setUserName(usuarioDTO.getUserName());
        usuarioEntity.setNombre(usuarioDTO.getNombre());
        usuarioEntity.setApellido(usuarioDTO.getApellido());
        usuarioEntity.setPassword(usuarioDTO.getPassword());
        usuarioEntity.setTelefono(usuarioDTO.getTelefono());
        usuarioEntity.setEdad(usuarioDTO.getEdad());
        usuarioEntity.setAltura(usuarioDTO.getAltura());
        usuarioEntity.setGenero(usuarioDTO.getGenero());
        usuarioEntity.setCiudad(usuarioDTO.getCiudad());
        usuarioEntity.setCoche(usuarioDTO.getCoche());
        usuarioEntity.setMusica_favorita(usuarioDTO.getMusica_favorita());
        usuarioEntity.setSalario(usuarioDTO.getSalario());

        return usuarioEntity;
    }
}
