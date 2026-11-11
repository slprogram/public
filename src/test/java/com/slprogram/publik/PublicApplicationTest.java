package com.slprogram.publik;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PublicApplicationTest
{
	@Test
	void test()
	{
		Assertions.assertEquals("Hello", new PublicApplication().hello());
	}
}
