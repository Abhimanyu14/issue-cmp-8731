package com.makeappssimple.abhimanyu.cmp_8731

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NavigationTest {
    @get:Rule(order = 0)
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun navigationTest() {
        // Verify we start at home screen
        composeTestRule
            .onNodeWithText(
                text = "Open Settings",
            )
            .assertIsDisplayed()

        // Click settings button and wait for navigation
        composeTestRule
            .onNodeWithText(
                text = "Open Settings",
            )
            .performClick()

        // Use waitForIdle to ensure navigation completes
        composeTestRule.waitForIdle()

        composeTestRule
            .onNodeWithText(
                text = "Settings Content",
            )
            .assertIsDisplayed()
    }
}
