package com.example.first.web.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
//テーブルデータを格納するためのエンティティ
//フィールド名は、テーブルの各カラムと合致させる必要がある
@Data
@AllArgsConstructor
public class MemberEntity {
    private String member_id;
    private String second_name;
    private String first_name;
    private String authority;
}
