/*
 * @fileoverview    {TransitoDinamica}
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementation done.
 * @version 2.0     Documentation added.
 */
package com.project.dev.api.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO: Description of {@code TransitoDinamica}.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
@Entity
@Table(name = "\"TransitoDinamica\"")
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class TransitoDinamica implements Serializable {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Long intIdDinamica;
    private Integer intIdCategoria;
    @Column(length = 8)
    private String strPlacaVehiculo;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtFechaHoraTransito;
    private Integer intPesoGeneral;
    @Column(length = 50)
    private String strPesoEjes;
    @Column(precision = 12, scale = 0)
    private Float fltVelocidad;
    @Lob
    @Column(length = 2147483647)
    private String txtBase64Placa;

}
