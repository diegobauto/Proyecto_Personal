<?php
    class usuario {
        public $nombre;
        public $user;
        public $telefono;
        public $celular;
        public $direccion;
        public $email;
        public $pw;
        public $id;

        public function getCodigo() {
            return $this->nombre;
        }
    
        public function setCodigo($id) {
            $this->codigo = $nombre;
        }
        
        public function getNombre() {
            return $this->user;
        }
    
        public function setNombre($nombre) {
            $this->nombre = $nombre;
        }
    
        public function getApellido() {
            return $this->apellido;
        }
    
        public function setApellido($apellido) {
            $this->apellido = $apellido;
        }
    
        public function getEmail() {
            return $this->email;
        }
    
        public function setEmail($email) {
            $this->email = $email;
        }
    
        public function getPassword() {
            return $this->password;
        }
    
        public function setPassword($password) {
            $this->password = $password;
        }
    }
?>
 