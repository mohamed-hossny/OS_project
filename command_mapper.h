#ifndef COMMAND_MAPPER_H
#define COMMAND_MAPPER_H

/*          HOSSNY + FATMA         */       

// Loads the DOS-to-Linux command mappings from a file
void load_command_map(const char *filename);

// Translates a DOS command into its corresponding Linux command
const char *translate_command(const char *dos_command);

// Executes the given Linux command using system()
void execute_command(const char *linux_command);

void display_commands();
/*          RAMADAN + SAMA          */     

// Displays the interactive DOS-shell-style menu
void show_menu();

// Displays the manual page for the shell (if implemented within the shell itself)
void display_manual();

#endif