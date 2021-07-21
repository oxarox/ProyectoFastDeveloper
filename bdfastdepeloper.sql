/*
 Navicat Premium Data Transfer

 Source Server         : BDFastDepeloper
 Source Server Type    : MySQL
 Source Server Version : 100419
 Source Host           : localhost:3306
 Source Schema         : bdfastdepeloper

 Target Server Type    : MySQL
 Target Server Version : 100419
 File Encoding         : 65001

 Date: 21/07/2021 17:40:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for autores
-- ----------------------------
DROP TABLE IF EXISTS `autores`;
CREATE TABLE `autores`  (
  `id_autor` int(10) NOT NULL AUTO_INCREMENT,
  `nombre_autor` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id_autor`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for boletas
-- ----------------------------
DROP TABLE IF EXISTS `boletas`;
CREATE TABLE `boletas`  (
  `id_boleta` int(10) NOT NULL AUTO_INCREMENT,
  `precio_neto` int(10) NOT NULL,
  `iva` int(10) NOT NULL,
  `total` int(10) NOT NULL,
  `fecha_venta` date NOT NULL,
  `hora_venta` time(0) NOT NULL,
  `id_cliente` int(10) NOT NULL,
  `id_usuario` int(10) NOT NULL,
  PRIMARY KEY (`id_boleta`) USING BTREE,
  INDEX `id_usuario`(`id_usuario`) USING BTREE,
  CONSTRAINT `boletas_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_user`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cabecera_facturas
-- ----------------------------
DROP TABLE IF EXISTS `cabecera_facturas`;
CREATE TABLE `cabecera_facturas`  (
  `id_factura` int(9) NOT NULL AUTO_INCREMENT,
  `id_proveedor` int(9) NOT NULL,
  `num_factura` int(9) NOT NULL,
  `fecha_factura` datetime(0) NOT NULL,
  `total_neto` int(10) NOT NULL,
  `iva` int(10) NOT NULL,
  `total` int(11) NOT NULL,
  PRIMARY KEY (`id_factura`) USING BTREE,
  INDEX `id_proveedor`(`id_proveedor`) USING BTREE,
  CONSTRAINT `cabecera_facturas_ibfk_1` FOREIGN KEY (`id_proveedor`) REFERENCES `distribuidores` (`id_distribuidor`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for categoria
-- ----------------------------
DROP TABLE IF EXISTS `categoria`;
CREATE TABLE `categoria`  (
  `id_categoria` int(10) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id_categoria`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for clientes
-- ----------------------------
DROP TABLE IF EXISTS `clientes`;
CREATE TABLE `clientes`  (
  `id_cliente` int(6) NOT NULL,
  `din_cliente` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `nombre` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `apellido_paterno` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `apellido_materno` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  PRIMARY KEY (`id_cliente`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for comuna
-- ----------------------------
DROP TABLE IF EXISTS `comuna`;
CREATE TABLE `comuna`  (
  `id_comuna` int(10) NOT NULL,
  `nombre_comuna` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id_comuna`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for contratos
-- ----------------------------
DROP TABLE IF EXISTS `contratos`;
CREATE TABLE `contratos`  (
  `id_contrato` int(15) NOT NULL,
  `id_trabajador` int(10) NOT NULL,
  `fecha_contrato` date NOT NULL,
  PRIMARY KEY (`id_contrato`) USING BTREE,
  INDEX `id_trabajador`(`id_trabajador`) USING BTREE,
  CONSTRAINT `contratos_ibfk_1` FOREIGN KEY (`id_trabajador`) REFERENCES `trabajadores` (`id_trabajador`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for copia_libros
-- ----------------------------
DROP TABLE IF EXISTS `copia_libros`;
CREATE TABLE `copia_libros`  (
  `id_copialib` int(10) NOT NULL,
  `cod_isbn` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `numero_serie` int(20) NOT NULL,
  `destino` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `id_precio_libro` int(10) NOT NULL,
  `id_estado_libro` int(10) NOT NULL,
  PRIMARY KEY (`id_copialib`) USING BTREE,
  INDEX `cod_isbn`(`cod_isbn`) USING BTREE,
  INDEX `id_precio_libro`(`id_precio_libro`) USING BTREE,
  INDEX `id_estado_libro`(`id_estado_libro`) USING BTREE,
  CONSTRAINT `copia_libros_ibfk_1` FOREIGN KEY (`cod_isbn`) REFERENCES `libros` (`codigo_isbn`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `copia_libros_ibfk_2` FOREIGN KEY (`id_precio_libro`) REFERENCES `precios_libros` (`id_precio_libro`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `copia_libros_ibfk_3` FOREIGN KEY (`id_estado_libro`) REFERENCES `estados_libros` (`id_estado_libro`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for correos
-- ----------------------------
DROP TABLE IF EXISTS `correos`;
CREATE TABLE `correos`  (
  `id_correo` int(10) NOT NULL,
  `correo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `id_tipo_user` int(10) NOT NULL,
  `id_usuario` int(10) NOT NULL,
  PRIMARY KEY (`id_correo`) USING BTREE,
  INDEX `id_tipo_user`(`id_tipo_user`) USING BTREE,
  INDEX `id_usuario`(`id_usuario`) USING BTREE,
  CONSTRAINT `correos_ibfk_1` FOREIGN KEY (`id_tipo_user`) REFERENCES `tipo_user` (`id_tipo_user`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `correos_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_user`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for datalles_boletas
-- ----------------------------
DROP TABLE IF EXISTS `datalles_boletas`;
CREATE TABLE `datalles_boletas`  (
  `id_detalle_boleta` int(10) NOT NULL,
  `id_boleta` int(10) NOT NULL,
  `id_copia_libro` int(10) NOT NULL,
  `valor_libro` int(10) NOT NULL,
  PRIMARY KEY (`id_detalle_boleta`) USING BTREE,
  INDEX `id_boleta`(`id_boleta`) USING BTREE,
  INDEX `id_copia_libro`(`id_copia_libro`) USING BTREE,
  CONSTRAINT `datalles_boletas_ibfk_1` FOREIGN KEY (`id_boleta`) REFERENCES `boletas` (`id_boleta`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `datalles_boletas_ibfk_2` FOREIGN KEY (`id_copia_libro`) REFERENCES `copia_libros` (`id_copialib`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for detalles_facturas
-- ----------------------------
DROP TABLE IF EXISTS `detalles_facturas`;
CREATE TABLE `detalles_facturas`  (
  `id_detallefact` int(10) NOT NULL AUTO_INCREMENT,
  `id_factura` int(10) NOT NULL,
  `cod_isbn` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `precio_compra` int(10) NOT NULL,
  `cantidad` int(5) NOT NULL,
  PRIMARY KEY (`id_detallefact`) USING BTREE,
  INDEX `cod_isbn`(`cod_isbn`) USING BTREE,
  INDEX `detalles_facturas_ibfk_1`(`id_factura`) USING BTREE,
  CONSTRAINT `detalles_facturas_ibfk_1` FOREIGN KEY (`id_factura`) REFERENCES `cabecera_facturas` (`id_factura`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `detalles_facturas_ibfk_2` FOREIGN KEY (`cod_isbn`) REFERENCES `libros` (`codigo_isbn`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for devoluciones
-- ----------------------------
DROP TABLE IF EXISTS `devoluciones`;
CREATE TABLE `devoluciones`  (
  `id_devolucion` int(10) NOT NULL,
  `id_pretamos` int(10) NOT NULL,
  `devolucion_real` int(10) NOT NULL,
  `dias_multa` int(10) NOT NULL,
  `precio_multa` int(10) NOT NULL,
  `precio_final` int(100) NOT NULL,
  PRIMARY KEY (`id_devolucion`) USING BTREE,
  CONSTRAINT `devoluciones_ibfk_1` FOREIGN KEY (`id_devolucion`) REFERENCES `prestamos` (`id_prestamo`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for direcciones
-- ----------------------------
DROP TABLE IF EXISTS `direcciones`;
CREATE TABLE `direcciones`  (
  `id_direccion` int(10) NOT NULL,
  `direccion` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `id_comuna` int(10) NOT NULL,
  `tipo_user` int(10) NOT NULL,
  `id_usuario` int(10) NOT NULL,
  PRIMARY KEY (`id_direccion`) USING BTREE,
  INDEX `id_comuna`(`id_comuna`) USING BTREE,
  INDEX `tipo_user`(`tipo_user`) USING BTREE,
  INDEX `id_usuario`(`id_usuario`) USING BTREE,
  CONSTRAINT `direcciones_ibfk_1` FOREIGN KEY (`id_comuna`) REFERENCES `comuna` (`id_comuna`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `direcciones_ibfk_2` FOREIGN KEY (`tipo_user`) REFERENCES `tipo_user` (`id_tipo_user`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `direcciones_ibfk_3` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_user`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for distribuidores
-- ----------------------------
DROP TABLE IF EXISTS `distribuidores`;
CREATE TABLE `distribuidores`  (
  `id_distribuidor` int(10) NOT NULL,
  `rut_proveedor` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `razon_social` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `direccion` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `id_comuna` int(10) NOT NULL,
  `fono` int(11) NOT NULL,
  `anno_primera_venta` int(4) NOT NULL,
  `correo_electronico` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id_distribuidor`) USING BTREE,
  INDEX `id_comuna`(`id_comuna`) USING BTREE,
  CONSTRAINT `distribuidores_ibfk_1` FOREIGN KEY (`id_comuna`) REFERENCES `comuna` (`id_comuna`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for editoriales
-- ----------------------------
DROP TABLE IF EXISTS `editoriales`;
CREATE TABLE `editoriales`  (
  `id_editorial` int(10) NOT NULL,
  `nombre_editorial` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id_editorial`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for estados_libros
-- ----------------------------
DROP TABLE IF EXISTS `estados_libros`;
CREATE TABLE `estados_libros`  (
  `id_estado_libro` int(4) NOT NULL,
  `descripcion` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id_estado_libro`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for idiomas
-- ----------------------------
DROP TABLE IF EXISTS `idiomas`;
CREATE TABLE `idiomas`  (
  `id_idioma` int(10) NOT NULL,
  `descripcion` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id_idioma`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for libro_autor
-- ----------------------------
DROP TABLE IF EXISTS `libro_autor`;
CREATE TABLE `libro_autor`  (
  `id_libro_autor` int(10) NOT NULL,
  `id_autor` int(10) NOT NULL,
  `codigo_isbn` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id_libro_autor`) USING BTREE,
  INDEX `codigo_isbn`(`codigo_isbn`) USING BTREE,
  INDEX `libro_autor_ibfk_1`(`id_autor`) USING BTREE,
  CONSTRAINT `libro_autor_ibfk_1` FOREIGN KEY (`id_autor`) REFERENCES `autores` (`id_autor`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `libro_autor_ibfk_2` FOREIGN KEY (`codigo_isbn`) REFERENCES `libros` (`codigo_isbn`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for libro_categoria
-- ----------------------------
DROP TABLE IF EXISTS `libro_categoria`;
CREATE TABLE `libro_categoria`  (
  `id_libro_categoria` int(10) NOT NULL AUTO_INCREMENT,
  `id_categoria` int(10) NOT NULL,
  `cod_isbn` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id_libro_categoria`) USING BTREE,
  INDEX `cod_isbn`(`cod_isbn`) USING BTREE,
  INDEX `libro_categoria_ibfk_1`(`id_categoria`) USING BTREE,
  CONSTRAINT `libro_categoria_ibfk_1` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id_categoria`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `libro_categoria_ibfk_2` FOREIGN KEY (`cod_isbn`) REFERENCES `libros` (`codigo_isbn`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for libros
-- ----------------------------
DROP TABLE IF EXISTS `libros`;
CREATE TABLE `libros`  (
  `codigo_isbn` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `id_idioma` int(10) NOT NULL,
  `anno_publicacion` int(4) NOT NULL,
  `id_editorial` int(10) NOT NULL,
  `nombre_libro` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `contador_serie` int(10) NOT NULL,
  `numeros_paguina` int(10) NOT NULL,
  PRIMARY KEY (`codigo_isbn`) USING BTREE,
  INDEX `id_idioma`(`id_idioma`) USING BTREE,
  INDEX `id_editorial`(`id_editorial`) USING BTREE,
  CONSTRAINT `libros_ibfk_1` FOREIGN KEY (`id_idioma`) REFERENCES `idiomas` (`id_idioma`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `libros_ibfk_2` FOREIGN KEY (`id_editorial`) REFERENCES `editoriales` (`id_editorial`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for metodo_pago_boleta
-- ----------------------------
DROP TABLE IF EXISTS `metodo_pago_boleta`;
CREATE TABLE `metodo_pago_boleta`  (
  `id_metodo_pago` int(10) NOT NULL,
  `id_boleta` int(10) NOT NULL,
  `id_metodo` int(10) NOT NULL,
  `metodo_monto` int(25) NOT NULL,
  PRIMARY KEY (`id_metodo_pago`) USING BTREE,
  INDEX `id_boleta`(`id_boleta`) USING BTREE,
  INDEX `id_metodo`(`id_metodo`) USING BTREE,
  CONSTRAINT `metodo_pago_boleta_ibfk_1` FOREIGN KEY (`id_boleta`) REFERENCES `boletas` (`id_boleta`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `metodo_pago_boleta_ibfk_2` FOREIGN KEY (`id_metodo`) REFERENCES `metodo_pago_boleta` (`id_metodo_pago`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for metodos_pagos
-- ----------------------------
DROP TABLE IF EXISTS `metodos_pagos`;
CREATE TABLE `metodos_pagos`  (
  `id_metodo` int(10) NOT NULL,
  `metodo` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id_metodo`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for precios_libros
-- ----------------------------
DROP TABLE IF EXISTS `precios_libros`;
CREATE TABLE `precios_libros`  (
  `id_precio_libro` int(6) NOT NULL,
  `precio` int(10) NOT NULL,
  `tipo_precio` int(10) NOT NULL,
  `cod_isbn` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `fecha_modificacion` date NOT NULL,
  PRIMARY KEY (`id_precio_libro`) USING BTREE,
  INDEX `tipo_precio`(`tipo_precio`) USING BTREE,
  INDEX `cod_isbn`(`cod_isbn`) USING BTREE,
  CONSTRAINT `precios_libros_ibfk_1` FOREIGN KEY (`tipo_precio`) REFERENCES `tipos_precios` (`id_tipo_precio`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `precios_libros_ibfk_2` FOREIGN KEY (`cod_isbn`) REFERENCES `libros` (`codigo_isbn`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for prestamos
-- ----------------------------
DROP TABLE IF EXISTS `prestamos`;
CREATE TABLE `prestamos`  (
  `id_prestamo` int(10) NOT NULL,
  `id_cliente` int(10) NOT NULL,
  `id_trabajador` int(10) NOT NULL,
  `fecha_prestamos` datetime(0) NOT NULL,
  `fecha_devolucion` date NOT NULL,
  `id_copia_libro` int(10) NOT NULL,
  `dias_arriendo` int(4) NOT NULL,
  `id_precio_arriendo` int(10) NOT NULL,
  PRIMARY KEY (`id_prestamo`) USING BTREE,
  INDEX `id_cliente`(`id_cliente`) USING BTREE,
  INDEX `id_trabajador`(`id_trabajador`) USING BTREE,
  INDEX `id_copia_libro`(`id_copia_libro`) USING BTREE,
  INDEX `id_precio_arriendo`(`id_precio_arriendo`) USING BTREE,
  CONSTRAINT `prestamos_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id_cliente`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `prestamos_ibfk_2` FOREIGN KEY (`id_trabajador`) REFERENCES `trabajadores` (`id_trabajador`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `prestamos_ibfk_3` FOREIGN KEY (`id_copia_libro`) REFERENCES `copia_libros` (`id_copialib`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `prestamos_ibfk_4` FOREIGN KEY (`id_precio_arriendo`) REFERENCES `precios_libros` (`id_precio_libro`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for telefonos
-- ----------------------------
DROP TABLE IF EXISTS `telefonos`;
CREATE TABLE `telefonos`  (
  `id_telefono` int(10) NOT NULL,
  `telefono` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `tipo_user` int(10) NOT NULL,
  `id_usuario` int(10) NOT NULL,
  PRIMARY KEY (`id_telefono`) USING BTREE,
  INDEX `tipo_user`(`tipo_user`) USING BTREE,
  INDEX `id_usuario`(`id_usuario`) USING BTREE,
  CONSTRAINT `telefonos_ibfk_1` FOREIGN KEY (`tipo_user`) REFERENCES `tipo_user` (`id_tipo_user`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `telefonos_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_user`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tipo_user
-- ----------------------------
DROP TABLE IF EXISTS `tipo_user`;
CREATE TABLE `tipo_user`  (
  `id_tipo_user` int(10) NOT NULL,
  `descripcion` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id_tipo_user`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tipos_precios
-- ----------------------------
DROP TABLE IF EXISTS `tipos_precios`;
CREATE TABLE `tipos_precios`  (
  `id_tipo_precio` int(10) NOT NULL,
  `descripcion` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id_tipo_precio`) USING BTREE,
  INDEX `id_tipo_precio`(`id_tipo_precio`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for trabajadores
-- ----------------------------
DROP TABLE IF EXISTS `trabajadores`;
CREATE TABLE `trabajadores`  (
  `id_trabajador` int(10) NOT NULL,
  `din_Trabajador` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `nombre` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `apellido_paterno` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `apellido_materno` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id_trabajador`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for usuarios
-- ----------------------------
DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE `usuarios`  (
  `id_user` int(10) NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `id_trabajador` int(10) NOT NULL,
  `id_tipo_usuario` int(10) NOT NULL,
  PRIMARY KEY (`id_user`) USING BTREE,
  INDEX `id_trabajador`(`id_trabajador`) USING BTREE,
  INDEX `id_tipo_usuario`(`id_tipo_usuario`) USING BTREE,
  CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`id_trabajador`) REFERENCES `trabajadores` (`id_trabajador`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `usuarios_ibfk_2` FOREIGN KEY (`id_tipo_usuario`) REFERENCES `tipo_user` (`id_tipo_user`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
