package com.oreo.finalproject_5re5_be.vc.entity;

import com.oreo.finalproject_5re5_be.project.entity.Project;
import com.oreo.finalproject_5re5_be.global.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Table(name = "vc_errorlog")
@Getter
@ToString
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
public class VcErrorLog extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ver_seq")
    private Long verSeq;

    @Column(nullable = false, name = "message")
    private String message;
    @Column(nullable = false, name = "code")
    private String code;
    @Column(nullable = false, name = "vc_reg_date")
    @CreatedDate
    private LocalDateTime date;
    @Column(nullable = false, name = "stack")
    private String stack;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pro_seq")
    private Project proSeq;
}
