package se.fk.github.rimfrost.yrkande;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import jakarta.inject.Inject;

import se.fk.github.rimfrost.yrkande.presentation.YrkandeController;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
public class YrkandeServiceTest
{

   @Inject
   YrkandeController yrkandeController;

   @Test
   public void TestYrkandeService()
   {
      assertEquals(true, true);
   }
}
