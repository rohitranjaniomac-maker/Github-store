import androidx.compose.foundation.layout.*;
import androidx.compose.material.*;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.dp;

@Composable
fun RepoDetailScreen(owner: String, description: String, stats: Map<String, Int>, language: String, topics: List<String>) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Owner: $owner", style = MaterialTheme.typography.h6)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Description: $description", style = MaterialTheme.typography.body1)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Language: $language", style = MaterialTheme.typography.body1)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Stats:", style = MaterialTheme.typography.h6)
        stats.forEach { (key, value) ->
            Text(text = "$key: $value", style = MaterialTheme.typography.body1)
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Topics:", style = MaterialTheme.typography.h6)
        topics.forEach { topic ->
            Text(text = "• $topic", style = MaterialTheme.typography.body1)
        }
    }
}