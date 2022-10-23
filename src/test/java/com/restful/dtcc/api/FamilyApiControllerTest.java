package com.restful.dtcc.api;

import com.restful.dtcc.entity.Family;
import com.restful.dtcc.repository.FamilyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(FamilyApiController.class)
public class FamilyApiControllerTest {

    @MockBean
    FamilyRepository familyRepository;

    @Autowired
    private MockMvc mvc;


    @Test
    public void testFamilyMockData() throws Exception {
        Family family = new Family();
        family.setFamilyId(1L);
        family.setFamilyName("Ryan");
        family.setFamilyDescription("6");
        when((familyRepository).findFamilyById(1L)).thenReturn(family);


        mvc.perform(get("/family")
                .param("familyId", "1")
                .contentType(APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(APPLICATION_JSON));
    }

}