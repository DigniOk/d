from datetime import datetime
def show_data(filename):
    print("\nЗаметки")
    with open(filename, "r", encoding="utf-8") as data:
        print(data.read())
    print("")

# Записывает информацию в файл
def export_data(filename):
    with open(filename, "r", encoding="utf-8") as data:
        note_file = data.read()
    id = len(note_file.split("\n"))
    with open(filename, "a", encoding="utf-8") as data:
        date = str(datetime.now().strftime("%d.%m.%Y %H:%M:%S")) 
        note_name = input("Введите название заметки: ")
        note = input("Введите заметку: ")
        data.write(f"{id} | {note_name} | {note} | {date}\n")
        print(f"Добавлена запись : {id} | {note_name} | {note} | {date}\n")
 
# Изменяет информацию из файла
def edit_data(filename):
    print("\nЗаметки")
    with open(filename, "r", encoding='utf-8') as data:
        note_book = data.read()
    print(note_book)
    print("")
    index_delete_data = int(input("Введите номер строки для редактирования: ")) - 1
    note_book_lines = note_book.split("\n")
    edit_note_book_lines = note_book_lines[index_delete_data]
    elements = edit_note_book_lines.split(" | ")
    print(elements)
    note_name = input("Введите название заметки: ")
    note = input("Введите заметку: ")
    date = str(datetime.now().strftime("%d.%m.%Y %H:%M:%S"))
    id = elements[0]
    if len(note_name) == 0:
        note_name = elements[1]
    if len(note) == 0:
        note = elements[2]
    edited_line = f"{id} | {note_name} | {note} | {date}"
    note_book_lines[index_delete_data] = edited_line
    print(f"Запись - {edit_note_book_lines}, изменена на - {edited_line}\n")
    with open(filename, "w", encoding='utf-8') as f:
        f.write("\n".join(note_book_lines))

# Удаляет информацию из файла
def delete_data(filename):
    print("\nЗаметки")
    with open(filename, "r", encoding="utf-8") as data:
        note_book = data.read()
        print(note_book)
    print("")
    index_delete_data = int(input("Введите номер строки для удаления: ")) - 1
    note_book_lines = note_book.split("\n")
    del_note_book_lines = note_book_lines[index_delete_data]
    note_book_lines.pop(index_delete_data)
    print(f"Удалена запись: {del_note_book_lines}\n")
    with open(filename, "w", encoding='utf-8') as data:
        data.write("\n".join(note_book_lines))

def delete_all_data(filename):
    open(filename,"w").close()
    
def view_notes(filename):
    print("\nЗаметки")
    with open(filename, "r", encoding='utf-8') as data:
        note_book = data.read()
        print(note_book)
        print("")
        print(datetime.now().strftime("%d.%m.%Y"))
        date_str = input("Введите дату для фильтрации заметок (в формате dd.mm.yyyy): ")
        note_book_lines = note_book.split("\n")
                  
def main():
    my_choice = -1
    note_file = "заметки.txt"

    # Создает файл если его нет в папке
    with open(note_file , "a", encoding="utf-8") as file:
         file.write("")

    while my_choice != 0:
        print("Выберите одно из действий:")
        print("1 - Вывести инфо на экран")
        print("2 - Написать заметку")
        print("3 - Изменить заметку")
        print("4 - Фильтр по дате заметок")
        print("5 - Произвести удаление заметки")
        print("6 - Удаление всех заметок")
        print("0 - Выход из программы")
        action = int(input("Действие: "))
        if action == 1:
            show_data(note_file)
        elif action == 2:
            export_data(note_file)
        elif action == 3:
            edit_data(note_file)
        elif action == 4: 
            view_notes(note_file)
        elif action == 5:
            delete_data(note_file)
        elif action == 6:
            delete_all_data(note_file)
        else:
            my_choice = 0

    print("До сокрой встечи, friend")

if __name__ == "__main__":
    main()