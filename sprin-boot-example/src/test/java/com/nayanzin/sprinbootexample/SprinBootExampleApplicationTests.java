package com.nayanzin.sprinbootexample;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.nayanzin.commonlib.CommonLibDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SprinBootExampleApplicationTests {

    @Test
    void contextLoads() {
        CommonLibDto expectedDto = new CommonLibDto();
        expectedDto.setId(1L);
        expectedDto.setName("Name");

        CommonLibDto actualDto = new CommonLibDto();
        actualDto.setId(1L);
        actualDto.setName("Name");

        assertThat(actualDto).isEqualTo(expectedDto);
    }

}
