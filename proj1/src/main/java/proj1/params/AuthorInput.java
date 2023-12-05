/*
 * Copyright (c) All rights reserved , The code is solely property of shantanu valsangikar coping and using it for any purpose is violation of law.
 */

package proj1.params;

import lombok.Data;

import java.util.List;

@Data
public class AuthorInput {
    private String bookName;
    private List<Integer> id;
}
