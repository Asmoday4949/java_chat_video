
package ch.hearc.cours.moo.generique;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ch.hearc.cours.moo.complexe.Complexe;

public class TestStack
	{
	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	@Before
	public void before()
		{
		// rien
		}

	@After
	public void after()
		{
		// rien
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*-----------------------------------------------------------------*/

	@Test
	public void testComplexe()
		{
		Stack_I<Complexe> stackL = new StackLinked<Complexe>();
		useComplexe(stackL);

		int capacity = 20;
		Stack_I<Complexe> stackA = new StackArray<Complexe>(capacity);
		useComplexe(stackA);
		}

	@Test
	public void testInteger()
		{
		Stack_I<Integer> stackL = new StackLinked<Integer>();
		use(stackL);

		int capacity = 20;
		Stack_I<Integer> stackA = new StackArray<Integer>(capacity);
		use(stackA);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void useComplexe(Stack_I<Complexe> stack)
		{
		Complexe z1 = Complexe.createCartesien(10, 20);
		Complexe z2 = Complexe.createCartesien(11, 22);

		Assert.assertTrue(stack.size() == 0);
		stack.push(z1);
		stack.push(z2);
		Assert.assertTrue(stack.size() == 2);

		Assert.assertTrue(stack.pop() == z2);
		Assert.assertTrue(stack.size() == 1);

		Assert.assertTrue(stack.pop() == z1);
		Assert.assertTrue(stack.size() == 0);
		}

	private static void use(Stack_I<Integer> stack)
		{
		Assert.assertTrue(stack.size() == 0);
		stack.push(1);
		stack.push(2);
		Assert.assertTrue(stack.size() == 2);

		Assert.assertTrue(stack.pop() == 2);
		Assert.assertTrue(stack.size() == 1);

		Assert.assertTrue(stack.pop() == 1);
		Assert.assertTrue(stack.size() == 0);
		}
	}
