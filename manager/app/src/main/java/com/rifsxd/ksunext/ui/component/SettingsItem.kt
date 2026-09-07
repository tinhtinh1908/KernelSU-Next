package com.rifsxd.ksunext.ui.component

import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.ListItemColors
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import com.dergoogler.mmrl.ui.component.LabelItem
import com.dergoogler.mmrl.ui.component.text.TextRow
import top.yukonga.miuix.kmp.basic.Switch as MiuixSwitch

@Composable
fun SwitchItem(
    icon: ImageVector? = null,
    title: String,
    summary: String? = null,
    checked: Boolean,
    enabled: Boolean = true,
    beta: Boolean = false,
    modifier: Modifier = Modifier,
    colors: ListItemColors = ListItemDefaults.colors(),
    onCheckedChange: (Boolean) -> Unit,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val stateAlpha = if (enabled) Modifier else Modifier.alpha(0.5f)

    ListItem(
        modifier = modifier.toggleable(
            value = checked,
            interactionSource = interactionSource,
            role = Role.Switch,
            enabled = enabled,
            indication = LocalIndication.current,
            onValueChange = onCheckedChange,
        ),
        colors = colors,
        headlineContent = {
            TextRow(
                leadingContent = if (beta) {
                    { LabelItem(modifier = stateAlpha, text = "Beta") }
                } else null
            ) {
                Text(
                    modifier = stateAlpha,
                    text = title,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Medium,
                )
            }
        },
        leadingContent = icon?.let {
            {
                Icon(
                    modifier = stateAlpha,
                    imageVector = icon,
                    contentDescription = title,
                )
            }
        },
        trailingContent = {
            MiuixSwitch(
                checked = checked,
                enabled = enabled,
                onCheckedChange = onCheckedChange,
            )
        },
        supportingContent = summary?.let {
            {
                Text(
                    modifier = stateAlpha,
                    text = it,
                    style = MaterialTheme.typography.bodyMedium,
                )
            }
        },
    )
}

@Composable
fun RadioItem(
    title: String,
    selected: Boolean,
    onClick: () -> Unit,
) {
    ListItem(
        modifier = Modifier.toggleable(
            value = selected,
            role = Role.RadioButton,
            onValueChange = { onClick() },
        ),
        headlineContent = { Text(title) },
        leadingContent = {
            RadioButton(selected = selected, onClick = null)
        },
    )
}
