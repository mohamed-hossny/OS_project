#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "command_mapper.h"
#define MAX_COMMAND 256

int main() {

    int choice,constant = 0;
    char input[MAX_COMMAND];
    load_command_map("mapping.txt");
    show_menu();
    while (1) {
        printf("Enter your choice (1-3): ");
        scanf("%d", &choice);
        // Clear input buffer
        switch (choice) {

            case 1:
                printf("DOS> ");
                getchar(); 
                fgets(input, sizeof(input), stdin);
                input[strcspn(input, "\n")] = 0;

                char cmd[MAX_COMMAND] = "";
                char args[MAX_COMMAND] = "";

                sscanf(input, "%s %[^\n]", cmd, args); 

                const char* linux_cmd = translate_command(cmd);
                if (linux_cmd != NULL) {
                      char full_command[MAX_COMMAND * 2];
                    if (strlen(args) > 0)
                        snprintf(full_command, sizeof(full_command), "%s %s", linux_cmd, args);
                    else
                        snprintf(full_command, sizeof(full_command), "%s", linux_cmd);

                    printf("Executing: %s\n", full_command);
                    execute_command(full_command);
                } else {
                    printf("Invalid DOS command: %s\n", cmd);
                }
                break;

            case 2:
                printf("Available commands (to be loaded from file lat er)...\n");
                display_commands();
                break;

            case 3:
                printf("Exiting... Goodbye!\n");
                exit(0);
                break;
            default:
                printf("Invalid choice. Please enter 1, 2, or 3.\n");
        }
    }

    return 0;
}
